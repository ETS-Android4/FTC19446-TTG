package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gyroscope;

@TeleOp

public class ArmIntakeTest extends LinearOpMode {
    private DcMotor LF, RF, LB, RB, Arm, Intake;
    private Gyroscope imu;

    public void runOpMode() {
        LF = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        RF = hardwareMap.get(DcMotor.class, "motorFrontRight");
        LB = hardwareMap.get(DcMotor.class, "motorBackLeft");
        RB = hardwareMap.get(DcMotor.class, "motorBackRight");

        imu = hardwareMap.get(Gyroscope.class, "imu");

        Arm = hardwareMap.get(DcMotor.class, "asdfasdf");
    }
}