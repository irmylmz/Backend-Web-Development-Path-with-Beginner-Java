## Merge Sort Aşamaları

Merge Sort, "böl ve birleştir" yöntemini kullanır.

**Verilen Dizi:**  
`[16, 21, 11, 8, 12, 22]`

### Aşama Aşama Merge Sort###
1. `[16, 21, 11]`                 -     `[8, 12, 22]`
2. `[16, 11]`    `[21]`           -     `[8, 12]`    `[22]`
3. `[11]`    `[16]`    `[21]`     -     `[8]`    `[12]`    `[22]`
4. `[11, 16, 21]`                 -     `[8, 12, 22]`
5. `[8, 11, 12, 16, 21, 22]`

### Big-O Notation:
Merge Sort her durumda `O(nlogn)` performansı sağlar. 