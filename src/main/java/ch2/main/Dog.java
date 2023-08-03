package ch2.main;

public class Dog {
    String name;
    String voice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }
    public String bark() {
        return "Waw";
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
