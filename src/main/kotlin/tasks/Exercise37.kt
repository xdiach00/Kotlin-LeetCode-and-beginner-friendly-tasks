package tasks

fun exercise37(
    workers: MutableList<String>,
    salaries: MutableList<Int>,
): MutableList<String> {
    fun bubbleSort(workersArr: MutableList<String>, salariesArr: MutableList<Int>): MutableList<String> {
        var swap = true
        while (swap) {
            swap = false
            for (i in 0 until salariesArr.size - 1) {
                if (salariesArr[i] > salariesArr[i + 1]) {
                    salariesArr[i] = salariesArr[i + 1]. also { salariesArr[i + 1] = salariesArr[i] }
                    workersArr[i] = workersArr[i + 1]. also { workersArr[i + 1] = workersArr[i] }

                    swap = true
                }
            }
        }

        return workersArr
    }

    return bubbleSort(workers, salaries)
}