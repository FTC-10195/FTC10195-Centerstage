package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.SubSys.PaperAirplane;


@TeleOp
public class PaperAirplaneTest extends LinearOpMode {
    public static double position = 0;
    PaperAirplane plane = new PaperAirplane(hardwareMap);
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        if(isStopRequested()) return;
        while(opModeIsActive()) {
            plane.setPostion(position);
        }
    }
}
