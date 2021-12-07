package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class AutonomousV4 extends LinearOpMode {
    private DcMotor LF, RF, LB, RB, Arm, Intake, Carousel;
    @Override
    public void runOpMode() {
        LF = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        RF = hardwareMap.get(DcMotor.class, "motorFrontRight");
        LB = hardwareMap.get(DcMotor.class, "motorBackLeft");
        RB = hardwareMap.get(DcMotor.class, "motorBackRight");
        Carousel = hardwareMap.get(DcMotor.class, "Carousel");
        Intake = hardwareMap.get(DcMotor.class, "poggy");
        Arm = hardwareMap.get(DcMotor.class, "arm");

        LB.setDirection(DcMotorSimple.Direction.REVERSE);
        LF.setDirection(DcMotorSimple.Direction.REVERSE);
        Arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        // raise arm to prevent it from dragging across floor
        Arm.setPower(-0.25);
        // backward
        move(-1, -1, -1, -1, 300);
        move(0,0,0,0,100);
        Carousel.setPower(-0.65/2);
        sleep(5000);
        // turn left
        move(-1,1,-1,1,375);
        // forward
        move(1,1,1,1,1300);
        move(0,0,0, 0,100);
        // raise arm for intake
        Arm.setPower(-0.3);
        // push freight out
        Intake.setPower(1);
        sleep(2000);
        // stop intake
        Intake.setPower(0);
        // backward
        move(-1,-1,-1,-1, 350);
        move(0,0,0,0,100);
        // turn left
        move(-1,1,-1,1, 1400);
        move(0,0,0,0, 100);
        // backward
        move(-1,-1,-1,-1, 7000);


    }

    public void move(double LF, double RF, double LB, double RB, int sleepMS) {
        this.LF.setPower(LF);
        this.LB.setPower(LB);
        this.RF.setPower(RF);
        this.RB.setPower(RB);
        sleep(sleepMS);
    }

}