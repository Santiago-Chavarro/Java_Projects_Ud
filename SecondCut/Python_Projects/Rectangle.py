class Rectangle:
    def __init__(self, base, height) -> None:
        self.base = base
        self.height = height
    
    def area(self):
        return self.base * self.height
    
    def perimeter(self):
        return 2 * (self.base * self.height)