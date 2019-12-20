#### Самые основные параметры JVM

- Classpath:

-classpath <cp> Main

- Печать всех опций и их значений по умолчанию:

-XX:+UnlockDiagnosticVMOptions -XX:+PrintFlagsFinal -version

- Размер кучи:

-Xms<number>[unit] - начальный;

-Xmx<number>[unit] - максимальный (по умолчанию 256 мб).

- Сборка мусора (рассказывал Миша):

-XX:+UseSerialGC;

-XX:+UseParallelGC;

-XX:+UseParnewGC;

-XX:+UseG1GC.

- Разрядность (если установлены и 32, и 64 битные JVM):

-d32, -d64.

- Оптимизации:

-XX:+UseStringCache - кеширование часто создаваемых строк;

-XX:+UseCompressedStrings - использовать byte[] для ASCII строк;

-XX:+AggressiveOpts - на самом деле включает следующие опции:

1. -XX:AutoBoxCacheMax=20000 - JVM будет кешировать бОльший рейнж целых чисел.

2. -XX:BiasedLockingStartupDelay=500 - для многопоточности (не будем обсуждать).

3. -XX:+OptimizeStringConcat - например, если много раз вызвали .append() для строки, то выделение памяти произойдет один раз и нужного размера.

4. -XX:+OptimizeFill - копирование памяти заменяется на более быстрое и низкоуровневое for (int i = 0; i < n; ++i) a[i] = v;

5. -XX:+EliminateAutoBox - применяется только к Integer.

- Размер указателей на объекты

-XX:+UseCompressedOops - уменьшает размер указателя до 32 бит для 64-разрядных JVM, но размер кучи ограничен 32 гб. Размер объектов в Java кратен 8.

- Out of memory:

-XX:OnOutOfMemoryError=<cmd args> - вызовется, если кончится память.