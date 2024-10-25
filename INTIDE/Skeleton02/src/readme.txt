# constructers in Auto en AutoFabriek neeeddo



# notes
Decided to make Auto abstract.

Decided to make abstract constructors in the abstract parent classes. You wouldn't make a theoretical car. You'd theoretically make a car.

## decorator
I think that AutoDecorater being child of Auto is a mistake. Especially if Auto auto is a protected variable.

## bridgePattern
Standernd name convention, Auto is abstract, just the idea of a car. No need to prefix Motor with abstract. Also the uml shows they don't have a constructor