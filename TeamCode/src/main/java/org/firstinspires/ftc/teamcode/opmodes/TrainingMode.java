package org.firstinspires.ftc.teamcode.opmodes;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import org.firstinspires.ftc.teamcode.MecanumDrive;

@TeleOp(name="Testing")
public class TrainingMode extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException {
        MecanumDrive mecanumDrive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, 0));
        waitForStart();
        while (opModeIsActive()){

            telemetry.addData("Right stick X value", gamepad1.right_stick_x);
            telemetry.addData("Right stick Y value", gamepad1.right_stick_y);
            telemetry.addData("Left stick X value", gamepad1.left_stick_x);
            telemetry.addData("Left stick Y value", gamepad1.left_stick_y);

            mecanumDrive.setDrivePowers(new PoseVelocity2d(new Vector2d(-gamepad1.left_stick_y, -gamepad1.left_stick_x), -gamepad1.right_stick_x));

            telemetry.update();
        }
    }


}
