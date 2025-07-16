# leetcode

## Important logics

1. Finding the mid element
```
    mid = left + (right-left)/2;
```
2. Mapping to int in a stream
```
    .mapToInt(Integer::intValue )
```

3. Converting list to array

```commandline
List<Integer> resultList = new ArrayList<>();
Integer[] resultArray = resultList.toArray(new Integer[0]);

```