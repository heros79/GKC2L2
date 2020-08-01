package am.home.service;

import am.home.interfaces.RobotService;
import am.home.model.*;

public class RobotServiceImpl implements RobotService {

    ActionServiceImpl actionService;
    RunTrack [] runTracks;

    public RobotServiceImpl(ActionServiceImpl actionService, RunTrack[] runTracks) {
        this.actionService = actionService;
        this.runTracks = runTracks;
    }

    @Override
    public void run(Robot robot) {
        for (RunTrack r : runTracks) {
            if (robot.getMaxRunDistance() < r.getLength()) {
                System.out.println("Robot cant run");
            } else {
                System.out.println("Robot run" + robot.getMaxRunDistance() + "metrs");
            }
        }
    }

    @Override
    public void run(Robot[] robot, RunTrack runTrack) {
        //TODO impement after
    }

    @Override
    public void run(Robot robot, RunTrack[] runTrack) {
        //TODO impement after
    }

    @Override
    public void run(Robot[] robot, RunTrack[] runTrack) {
        //TODO impement after
    }

    @Override
    public void jump(Robot robot, Wall wall) {
        if (robot.getMaxJumpDistance() < wall.getHeight()) {
            System.out.println("Robot cant jump");
        }
    }
}