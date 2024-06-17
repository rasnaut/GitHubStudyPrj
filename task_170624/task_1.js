const numbers = [33, 1, 7, 3, 56];

numbers.sort(); // [1, 3, 33, 56, 7]
numbers.sort((a, b) => a - b); // [1, 3, 7, 33, 56]
numbers.sort((a, b) => b - a); // [56, 33, 7, 3, 1]