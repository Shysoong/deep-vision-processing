package ch.bildspur.vision;

import ch.bildspur.vision.deps.Repository;
import processing.core.PApplet;

public class DeepVisionPreview extends DeepVision {
    public DeepVisionPreview(PApplet sketch) {
        super(sketch);
    }

    public MultiHumanPoseNetwork createMultiHumanPoseEstimation() {
        prepareDependencies(Repository.MultiHumanPoseEstimationModel);
        return new MultiHumanPoseNetwork(Repository.MultiHumanPoseEstimationModel.getPath());
    }

    public TextBoxesNetwork createTextBoxesPlusPlusDetector() {
        prepareDependencies(Repository.TextBoxesPlusPlusProtoText, Repository.TextBoxesPlusPlusModel);
        return new TextBoxesNetwork(Repository.TextBoxesPlusPlusProtoText.getPath(), Repository.TextBoxesPlusPlusModel.getPath());
    }

    public CRNNNetwork createCRNN() {
        prepareDependencies(Repository.CRNNModel);
        return new CRNNNetwork(Repository.CRNNModel.getPath());
    }

    public FSRCNNNetwork createFSCRNN() {
        prepareDependencies(Repository.FSRCNNModel);
        return new FSRCNNNetwork(Repository.FSRCNNModel.getPath());
    }
}