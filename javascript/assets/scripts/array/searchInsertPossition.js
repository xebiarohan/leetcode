var searchInsert = function(nums, target) {
    let first = 0;
    let last = nums.length -1;
    let mid = first + Math.floor((last-first)/2);

    while(first <= last) {
        mid = first + Math.floor((last-first)/2);

        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] < target) {
            first = mid+1;
        } else {
            last = mid -1;
        }
    }

    if(target > nums[mid]) {
        return mid +1;
    } else {
        return mid;
    }
};

const result = searchInsert([1,3,5,6],5);

console.log(result);