var lengthOfLastWord = function(s) {
    let a = s.trim().split(' ');

    return a[a.length -1].length;
};

lengthOfLastWord('asdsd  ');