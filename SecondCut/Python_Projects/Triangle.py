class RightTriangle:
    def __init__(self, base, height):
        self.base = base
        self.height = height
        
    def Area(self):
        return (self.base * self.height) / 2
    
    def Perimeter(self):
        self.hypotenuse = (self.base ** 2 + self.height) ** 0.5
        return self.hypotenuse + self.base + self.height