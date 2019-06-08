// in : ___abc____cd__ef
// out: abc_cd_ef
public void removeSpaces(char[] s) {
    // slow: on the left hand side of slow, not including slow, are final answers
    // fast: current pointer
    int slow = 0, fast = 0, n = s.length;
    int wordCount = 0;  // special case for 1st word
    while (true) {
        while (fast < n && s[fast] == ' ') {
            ++fast;  // 1. skip all leading ' ' in front of each word
        }
        if (fast == n) {
            break;
        }
        // when to move slow: only when copy letters to slow
        if (wordCount > 0) {
            s[slow++] = ' ';  // 2. add ' ' in front of (2nd+) word
        }
        while (fast < n && s[fast] != ' ') {
            s[slow++] = s[fast++];  // 3. copy a word
        }
        ++wordCount;
    }
    s.resize(slow);
}
