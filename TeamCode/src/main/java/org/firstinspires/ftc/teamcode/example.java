package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class example extends LinearOpMode{
    // variable names are Left/Right and Front/Back
    DcMotor LF;
    DcMotor RF;
    DcMotor LB;
    DcMotor RB;

    public void runOpMode() {
        LF = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        RF = hardwareMap.get(DcMotor.class, "motorFrontRight");
        LB = hardwareMap.get(DcMotor.class, "motorBackLeft");
        RB = hardwareMap.get(DcMotor.class, "motorBackRight");

        waitForStart();

        // call move functions with hardcoded power and sleep values
        move(0, 0, 0, 0, 0);

    }

    public void move(double LF, double RF, double LB, double RB, int sleepMS) {
        this.LF.setPower(LF);
        this.RF.setPower(LB);
        this.LB.setPower(RF);
        this.RB.setPower(RB);
        sleep(sleepMS);
    }

}
