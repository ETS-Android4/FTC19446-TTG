package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public class ArmIntakeTest extends LinearOpMode {
    private DcMotor LF, RF, LB, RB, Arm, Intake;
    private int intPos = 20;

    public void runOpMode() {
        LF = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        RF = hardwareMap.get(DcMotor.class, "motorFrontRight");
        LB = hardwareMap.get(DcMotor.class, "motorBackLeft");
        RB = hardwareMap.get(DcMotor.class, "motorBackRight");

        Arm = hardwareMap.get(DcMotor.class, "poggy");
        DcMotor.ZeroPowerBehavior.BRAKE;

        waitForStart();

        //
        while (opModeIsActive()) {
            if (gamepad1.a && intPos <= 135) {
                intPos += 2;
            } else if (gamepad1.b && intPos >= 20) {
                intPos += -2;
            }

            if ((gamepad1.a && intPos <= 135) ||  (gamepad1.b && intPos >= 20)){
                Arm.setTargetPosition(intPos);
                Arm.setPower(1);
            }else{
                Arm.setPower(0);
            }
            telemetry.addData("Arm Power:", Arm.getPower());
            telemetry.update();

        }
    }
}