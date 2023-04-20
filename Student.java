class Student{
    private String _name;

    Student(){};
    Student(String name) {
        _name = name;
        System.out.println(_name);
    }

    public void calculateAvg(int math, int english) {
        System.out.println((math + english)/2);
    }
}