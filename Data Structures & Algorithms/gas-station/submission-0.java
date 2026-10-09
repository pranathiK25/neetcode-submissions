class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0; i < gas.length; i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }
        if(totalCost > totalGas) return -1;
        int stIndex = 0, currentGas = 0;
        for(int i = 0; i < gas.length; i++){
            currentGas += gas[i] - cost[i];

            if(currentGas < 0){
                stIndex = i + 1;
                currentGas = 0;
            }
        }
        return stIndex;
    }
}
