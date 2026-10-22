package org.firstinspires.ftc.teamcode.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class TrainingMode extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        while (opModeIsActive()){
            telemetry.addData("Right stick X vale", gamepad1.right_stick_x);
            telemetry.addData("Right stick Y value", gamepad1.right_stick_y);

            telemetry.update();
        }
    }


}
