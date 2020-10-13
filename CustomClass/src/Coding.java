public class Coding {
    private String language;
    private double version;
    private String learning;


    // empty constructor
    // public  Coding() {
    //     language = "python";
    //     version = 3.6;
    //     learning = "easy";
    // }

    // constructor using 2 variable
    // public Coding(String language, double version) {
    //     this.language = language;
    //     this.version = version;
    // }

    // constructor using 3 variable
    public Coding(String language, double version, String learning) {
        this.language = language;
        this.version = version;
        this.learning = learning;
    }

    // Get Methods
    public String getLanguage() {
        return language;
    }
    public double getVersion() {
        return version;
    }
    public String getLearning() {
        return learning;
    }
    // Set Methods

    // Return Boolean Method

    // Return String Method
    public String LearningHard() {
        return learning;
    }



}
