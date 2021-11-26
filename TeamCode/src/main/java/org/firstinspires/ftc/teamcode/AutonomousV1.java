package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class AutonomousV1 extends LinearOpMode {
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

        waitForStart();

        double b = 1;

        Arm.setPower(-0.25);
        Arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        move(0.75, 0.75, 0.75, 0.75, 600);
        move(0,0,0,0,500);
        telemetry.addData("asdf", 8989);
        telemetry.update();
        move(-1, 1, -1, 1, 850);
        move(0,0,0,0,200);
        move(-1, -1, -1, -1, 2500);
        move(-1,-1,-1,-1,500);
        move(0,0,0,0,0);
    }

    public void move(double LF, double RF, double LB, double RB, int sleepMS) {
        this.LF.setPower(LF);
        this.RF.setPower(RF);
        this.LB.setPower(LB);
        this.RB.setPower(RB);

        sleep(sleepMS);

    }
}
