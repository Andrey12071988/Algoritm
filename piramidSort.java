// ДЗ2 Пирамидальная сортировка

public class piramidSort {
    public static void sort(int[] array) {
        // Построение кучи (перегруппировка массива)
        for (int i=array.length/2-1; i>=0; i--){
            heapify(array, array.length, i);
        }

        // Один за другим извлекаем элементы из кучи
        for (int i = array.length-1; i>=0; i--){
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

/**
 * Пирамидальная сортировка
 * @param array     - Массив для сортировки
 * @param heapSize  - 
 * @param rootIndex - Корневой элемент 
 */
public static void heapify(int[] array, int heapSize, int rootIndex) {
    int largest = rootIndex; // Инициализируем наибольший элемент, как корень
    int leftChild = 2 * rootIndex + 1; // Левый дочерний элемент (2*i+1)
    int rightChild = 2 * rootIndex + 2; // Правый дочерний элемент (2*i+2)

    // Если левый дочерний элемент больше корня (родителя)
    if (leftChild < heapSize && array[leftChild] > array[largest]){
        largest = leftChild;
    }
    // Если правый дочерний элемент больше корня (родителя)
    if (rightChild < heapSize && array[rightChild] > array[largest]){
        largest =rightChild;
    }
    // Если самый большой элемент не родительский (корень)
    if (largest != rootIndex){
        int temp = array[rootIndex];
        array[rootIndex] = array[largest];
        array[largest] = temp;

        // Реекурсивно преобразуем в двоичную кучу затронутое поддерево
        heapify(array, heapSize, largest);
    }
}
}
