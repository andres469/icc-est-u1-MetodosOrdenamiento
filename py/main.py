from sortSelection import SortSelection
def main():
    numeros=[5,2,9,1,5,6]
    print("Estudiante: Andres Tenesaca")
    print("original: ",numeros)

    selection = SortSelection()
    selection.sort_asecendente(numeros)
    print("ordenado: ",numeros)
    selection.sort_Desendente(numeros)
    print("ordenado: ",numeros)



if __name__=="__main__":
    main()