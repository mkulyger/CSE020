from logic import TruthTable

#not a
notTable = TruthTable(['a'], ['-a'])
notTable.display()
print("")

#a and b
andTable = TruthTable(['a', 'b'], ['a and b'])
andTable.display()
print("")

#a or b
orTable = TruthTable(['a', 'b'], ['a or b'])
orTable.display()
print("")

#if a then b
ifTable = TruthTable(['a', 'b'], ['a -> b'])
ifTable.display()
print("")

#a if and only b
onlyTable = TruthTable(['a', 'b'], ['a <-> b'])
onlyTable.display()
print()
