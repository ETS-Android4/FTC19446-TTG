package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class AutonomousV2 extends LinearOpMode {
    private DcMotor LF, RF, LB, RB, Arm, Intake;
    @Override
    public void runOpMode() {
        LF = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        RF = hardwareMap.get(DcMotor.class, "motorFrontRight");
        LB = hardwareMap.get(DcMotor.class, "motorBackLeft");
        RB = hardwareMap.get(DcMotor.class, "motorBackRight");

        Intake = hardwareMap.get(DcMotor.class, "poggy");
        Arm = hardwareMap.get(DcMotor.class, "arm");

        LB.setDirection(DcMotorSimple.Direction.REVERSE);
        LF.setDirection(DcMotorSimple.Direction.REVERSE);
        Arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        double b = 1;

        waitForStart();

        Arm.setPower(-0.25);

        // we got trolled by field team because with v1, we will collide with the shipping hub
        move(-1, 1, -1, 1, 800);
        move(0,0,0,0,100);
        move(-1, -1, -1, -1, 1800);
        move(0,0,0,0,100);
        move(1, -1, -1, 1, 1000);
        move(0,0,0,0,100);
        move(-1, -1, -1, -1, 3500);
        move(0,0,0,0,100);
    }
    public void move(double LF, double RF, double LB, double RB, int sleepMS) {
        this.LF.setPower(LF);
        this.LB.setPower(LB);
        this.RF.setPower(RF);
        this.RB.setPower(RB);
        sleep(sleepMS);
    }
}
