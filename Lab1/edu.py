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
    def average(self, *universities):
        cnt = len(self.students)
        avg = sum(map(lambda x: x.gpa, self.students))
        for i in universities:
            for ii in i.students:
                cnt += 1
                avg += ii.gpa
        print(f"Average media is {avg/cnt:.2f}")
            

s1 = [Student("Ion", 20, 8.4), Student("Ana", 19, 9.3)]
UTM = University("UTM", 1964, s1)
s2 = [Student("Vasile", 43, 6.8)]
UA = University("Universitatea Agrara", 1933, s2)
s3 = [Student("Vlad", 21, 8.3)]
ULIM = University("ULIM", 1992, s3)

UTM.info()
UA.info()
ULIM.info()

UTM.average(UA, ULIM)
