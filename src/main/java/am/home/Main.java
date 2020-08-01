package am.home;

import am.home.model.Cat;
import am.home.model.Robot;
import am.home.model.RunTrack;
import am.home.service.ActionServiceImpl;
import am.home.service.RobotServiceImpl;

public class Main {

    public static void main(String[] args) {

        ActionServiceImpl actionService =
                new ActionServiceImpl();

        RunTrack[] runTracks = new RunTrack[]{new RunTrack(100)};

        RobotServiceImpl rsi =
                new RobotServiceImpl(actionService, runTracks);
        Robot robot =
                new Robot("Robot One", 110, 60);
        rsi.run(robot);

    }
}