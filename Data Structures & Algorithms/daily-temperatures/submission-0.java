class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> st= new Stack<>();
    int [] output= new int [temperatures.length];
    output[output.length-1]=0;
    st.push(temperatures.length-1);
    for(int i=temperatures.length-2;i>=0;i--){
        while( !st.isEmpty() && temperatures[i]>=temperatures[st.peek()] ){
            st.pop();
        }
        if(st.isEmpty() ){output[i]=0;}
        else if(temperatures[i]<temperatures[st.peek()]){
            output[i]=st.peek()-i;
        }
        st.push(i);
    }
    return output;
    }
}