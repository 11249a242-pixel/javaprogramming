interface Sports {
    void play();
}

interface Studies {
    void study();
}

class Student implements Sports, Studies {
    public void play() {
        System.out.println("Student plays cricket");
    }

    public void study() {
        System.out.println("Student studies Java");
    }
}

class sportss {
    public static void main(String[] args) {
        Student s = new Student();

        s.play();
        s.study();
    }
}