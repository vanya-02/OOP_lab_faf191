class Student:
    def __init__(self, name, age, gpa):
        self.name = name
        self.age = age
        self.gpa = gpa

    def info(self):
        print(f"Name: {self.name}\nAge: {self.age}\nGPA: {self.gpa}\n")


class University:
    def __init__(self, name, fy, students):
        self.name = name
        self.fy = fy
        self.students = students

    def info(self):
        print(f"Name: {self.name}\nFounded: {self.fy}\nStudents: {list(map(lambda x: x.name, self.students))}\n")


s1 = [Student("Ion", 20, 8.4), Student("Ana", 19, 9.3)]
u1 = University("UTM", 1964, s1)

s2 = [Student("Vasile", 43, 6.8)]
u2 = University("Universitatea Agrara", 1933, s2)

s3 = [Student("Vlad", 21, 8.3)]
u3 = University("ULIM", 1992, s3)


def average(universities):
    avg = 0
    cnt = 0
    for i in universities:
        for ii in i.students:
            avg += ii.gpa
            cnt += 1
    print(f"Average media is {avg/cnt:.2f}")

u1.info()
u2.info()
u3.info()
average([u1, u2, u3])
