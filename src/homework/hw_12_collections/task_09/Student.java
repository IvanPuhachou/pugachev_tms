package homework.hw_12_collections.task_09;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "This student is " + surname + " " + name;
    }

    @Override
    public int compareTo(Student o) {                  // сравниваем по фамилии и имени как в школьном журнале

        int len1 = this.surname.length();              // скопировано из класса String
        int len2 = o.surname.length();
        int lim = Math.min(len1, len2);
        char v1[] = this.surname.toCharArray();
        char v2[] = o.surname.toCharArray();

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }

        if (len1 == len2) {
            int len1name = this.name.length();
            int len2name = o.name.length();
            int limName = Math.min(len1name, len2name);
            char v1name[] = this.name.toCharArray();
            char v2name[] = o.name.toCharArray();

            int g = 0;
            while (g < limName) {
                char c1 = v1name[g];
                char c2 = v2name[g];
                if (c1 != c2) {
                    return c1 - c2;
                }
                g++;
            }
        }
        return len1 - len2;
    }

}

