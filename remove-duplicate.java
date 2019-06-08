//  in: a bbbb a wz 俄罗斯方块消除
// out: wz
public String removeDuplicate_explicitStack(String s) {
    if (s == null || s.length() <= 1) {
        return;
    }
    
    StringBuilder stack = new StringBuilder();
    int i = 0;
    while (i < s.length()) {  // is is the fast index
        char c = s.charAt(i);
        if (!stack.isEmpty() && s.charAt(i) == stack.charAt(stack.length() - 1)) {
            while (i < s.length() && c == s.charAt(i)) {
                ++i;
            }
            stack.setLength(stack.length() - 1);
        } else {
            stack.append(s.charAt(i));
            ++i;
        }
    }
    
    return stack.toString();
}

public String removeDuplicate_implicitStackUsingTwoPointers(String s) {
    // slow: pointing to the top element of the stack
    // fast: current pointer
    // Time = O(n)
    // Space = O(1)
}
