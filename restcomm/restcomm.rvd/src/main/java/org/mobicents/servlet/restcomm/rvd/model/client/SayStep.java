package org.mobicents.servlet.restcomm.rvd.model.client;

import org.mobicents.servlet.restcomm.rvd.interpreter.Interpreter;
import org.mobicents.servlet.restcomm.rvd.model.rcml.RcmlSayStep;
import org.mobicents.servlet.restcomm.rvd.model.rcml.RcmlStep;

public class SayStep extends Step {

    private String phrase;
    private String voice;
    private String language;
    private Integer loop;
    private Iface iface;

    public static class Iface {
        private Boolean optionsVisible;

        public Boolean getOptionsVisible() {
            return optionsVisible;
        }

        public void setOptionsVisible(Boolean optionsVisible) {
            this.optionsVisible = optionsVisible;
        }
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getLoop() {
        return loop;
    }

    public void setLoop(Integer loop) {
        this.loop = loop;
    }

    public Iface getIface() {
        return iface;
    }

    public void setIface(Iface iface) {
        this.iface = iface;
    }
    public RcmlStep render(Interpreter interpreter) {

        RcmlSayStep sayStep = new RcmlSayStep();
        sayStep.setPhrase(interpreter.populateVariables(getPhrase()));
        sayStep.setVoice(getVoice());
        sayStep.setLanguage(getLanguage());
        sayStep.setLoop(getLoop());

        return sayStep;
    }
}
