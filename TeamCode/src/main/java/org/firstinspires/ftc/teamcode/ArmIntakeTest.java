package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public class ArmIntakeTest extends LinearOpMode {
    private DcMotor LF, RF, LB, RB, Arm, Intake;
    private Blinker expansion_Hub_2;

    public void runOpMode() {
        LF = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        RF = hardwareMap.get(DcMotor.class, "motorFrontRight");
        LB = hardwareMap.get(DcMotor.class, "motorBackLeft");
        RB = hardwareMap.get(DcMotor.class, "motorBackRight");

        Arm = hardwareMap.get(DcMotor.class, "poggy");

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                Arm.setPower(-1);
            } else if (gamepad1.b) {
                Arm.setPower(1);
            } else {
                Arm.setPower(0);
            }
            telemetry.addData("Arm Power:", Arm.getPower());
            telemetry.update();

        }
    }
}