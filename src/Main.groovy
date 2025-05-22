
    def countElements(List<Integer> list) {
        def elementCountMap = [:] // Создаем пустую карту

        list.each { element ->
            elementCountMap[element] = (elementCountMap[element] ?: 0) + 1
        }

        return elementCountMap
    }

    def numbers = [1, 3, 4, 5, 1, 5, 4]
    def result = countElements(numbers)

    println(result) // Вывод: [1:2, 3:1, 4:2, 5:2]

