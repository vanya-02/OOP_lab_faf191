class Monitor:
    def __init__(self, color="Black", dim=23.8, x=1080, y=1920):
        self.color = color
        self.dim = dim
        self.x = x
        self.y = y

    def info(self):
        print(f"color: {self.color}\ndimensions: {self.dim}inch\nresolution: {self.x}x{self.y}\n")
    def compare(self, monitor2):
        self.info()
        monitor2.info()


Samsung = Monitor("Pink", 70, 3840)
Samsung.y = 2160

Panasonic = Monitor()
Panasonic.compare(Samsung)