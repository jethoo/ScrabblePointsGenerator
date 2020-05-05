package project;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScrabbleModel {


    ArrayList<String> words = new ArrayList<>();
    private String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private String previousWords;
    private int points=0;
    private String leftA,leftB,leftC,leftD,leftE,leftF,leftG,leftH,leftI,leftJ,leftK,leftL,leftM,leftN,leftO,leftP,leftQ,leftR,leftS,
    leftT,leftU,leftV,leftW,leftX,leftY,leftZ;

    private int[] remaining = {9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1};

    public boolean visible = true;

    public void setPoints(int points) {
        this.points = points;
    }

    public String getLeftA() {
        return leftA;
    }

    public void setLeftA(String leftA) {
        this.leftA = leftA;
    }

    public String getLeftB() {
        return leftB;
    }

    public void setLeftB(String leftB) {
        this.leftB = leftB;
    }

    public String getLeftC() {
        return leftC;
    }

    public void setLeftC(String leftC) {
        this.leftC = leftC;
    }

    public String getLeftD() {
        return leftD;
    }

    public void setLeftD(String leftD) {
        this.leftD = leftD;
    }

    public String getLeftE() {
        return leftE;
    }

    public void setLeftE(String leftE) {
        this.leftE = leftE;
    }

    public String getLeftF() {
        return leftF;
    }

    public void setLeftF(String leftF) {
        this.leftF = leftF;
    }

    public String getLeftG() {
        return leftG;
    }

    public void setLeftG(String leftG) {
        this.leftG = leftG;
    }

    public String getLeftH() {
        return leftH;
    }

    public void setLeftH(String leftH) {
        this.leftH = leftH;
    }

    public String getLeftI() {
        return leftI;
    }

    public void setLeftI(String leftI) {
        this.leftI = leftI;
    }

    public String getLeftJ() {
        return leftJ;
    }

    public void setLeftJ(String leftJ) {
        this.leftJ = leftJ;
    }

    public String getLeftK() {
        return leftK;
    }

    public void setLeftK(String leftK) {
        this.leftK = leftK;
    }

    public String getLeftL() {
        return leftL;
    }

    public void setLeftL(String leftL) {
        this.leftL = leftL;
    }

    public String getLeftM() {
        return leftM;
    }

    public void setLeftM(String leftM) {
        this.leftM = leftM;
    }

    public String getLeftN() {
        return leftN;
    }

    public void setLeftN(String leftN) {
        this.leftN = leftN;
    }

    public String getLeftO() {
        return leftO;
    }

    public void setLeftO(String leftO) {
        this.leftO = leftO;
    }

    public String getLeftP() {
        return leftP;
    }

    public void setLeftP(String leftP) {
        this.leftP = leftP;
    }

    public String getLeftQ() {
        return leftQ;
    }

    public void setLeftQ(String leftQ) {
        this.leftQ = leftQ;
    }

    public String getLeftR() {
        return leftR;
    }

    public void setLeftR(String leftR) {
        this.leftR = leftR;
    }

    public String getLeftS() {
        return leftS;
    }

    public void setLeftS(String leftS) {
        this.leftS = leftS;
    }

    public String getLeftT() {
        return leftT;
    }

    public void setLeftT(String leftT) {
        this.leftT = leftT;
    }

    public String getLeftU() {
        return leftU;
    }

    public void setLeftU(String leftU) {
        this.leftU = leftU;
    }

    public String getLeftV() {
        return leftV;
    }

    public void setLeftV(String leftV) {
        this.leftV = leftV;
    }

    public String getLeftW() {
        return leftW;
    }

    public void setLeftW(String leftW) {
        this.leftW = leftW;
    }

    public String getLeftX() {
        return leftX;
    }

    public void setLeftX(String leftX) {
        this.leftX = leftX;
    }

    public String getLeftY() {
        return leftY;
    }

    public void setLeftY(String leftY) {
        this.leftY = leftY;
    }

    public String getLeftZ() {
        return leftZ;
    }

    public void setLeftZ(String leftZ) {
        this.leftZ = leftZ;
    }

    public String getPreviousWords() {
        return previousWords;
    }

    public void setPreviousWords(String previousWords) {
        this.previousWords = previousWords;
    }

    public String getPoints(String word) throws Exception{

        Pattern vowel = Pattern.compile("([a,e,i,o,u])");
        Matcher vowelMatcher = vowel.matcher(word);
        int countVowel = 0;
        while(vowelMatcher.find()){
            countVowel++;
        }

        if( countVowel != 0 && word.length() >= 2 && word.length() <=8 && !words.contains(word)){
            words.add(word);
            setPreviousWords(word);

            runA(word);
            runB(word);
            runC(word);
            runD(word);
            runE(word);
            runF(word);
            runG(word);
            runH(word);
            runI(word);
            runJ(word);
            runK(word);
            runL(word);
            runM(word);
            runN(word);
            runO(word);
            runP(word);
            runQ(word);
            runR(word);
            runS(word);
            runT(word);
            runU(word);
            runV(word);
            runW(word);
            runX(word);
            runY(word);
            runZ(word);
            checkVowel();
        }
        else{
            throw new Exception("Word must have one vowel,not duplicated and of size between 2 and 8");
        }

        return String.valueOf(points);
    }

    private void checkVowel() throws Exception{
        Integer a = Integer.parseInt(getLeftA());
        Integer e = Integer.parseInt(getLeftE());
        Integer i = Integer.parseInt(getLeftI());
        Integer o = Integer.parseInt(getLeftO());
        Integer u = Integer.parseInt(getLeftU());

        if(a == 0 && e == 0 && i == 0 && o == 0 && u == 0){
            throw new Exception("!!! GAME OVER !!!");
        }
    }

    private int runA(String word) throws Exception{
        Pattern a = Pattern.compile("([a])");
        Matcher aMatcher = a.matcher(word);
        int countA = 0;
        while(aMatcher.find()){
            countA++;
        }
        if(remaining[0] >= countA){
            points = points + (countA*1);
            remaining[0] = remaining[0] - (countA*1);
            setLeftA(String.valueOf(remaining[0]));
        }else{
            throw new Exception(String.format("Only %s letter a is available",remaining[0]));
        }
        return points;
    }

    private int runB(String word) throws Exception{
        Pattern b = Pattern.compile("([b])");
        Matcher bMatcher = b.matcher(word);
        int countB = 0;
        while(bMatcher.find()){
            countB++;
        }
        if(remaining[1] >= countB){
            points = points + (countB*3);
            remaining[1] = remaining[1] - (countB*1);
            setLeftB(String.valueOf(remaining[1]));
        }else{
            throw new Exception(String.format("Only %s letter b is available",remaining[1]));
        }
        return points;
    }

    private int runC(String word) throws Exception{
        Pattern c = Pattern.compile("([c])");
        Matcher cMatcher = c.matcher(word);
        int countC = 0;
        while(cMatcher.find()){
            countC++;
        }
        if(remaining[2] >= countC){
            points = points + (countC*3);
            remaining[2] = remaining[2] - (countC*1);
            setLeftC(String.valueOf(remaining[2]));
        }else{
            throw new Exception(String.format("Only %s letter c is available",remaining[2]));
        }
        return points;
    }

    private int runD(String word) throws Exception{
        Pattern d = Pattern.compile("([d])");
        Matcher dMatcher = d.matcher(word);
        int countD = 0;
        while(dMatcher.find()){
            countD++;
        }
        if(remaining[3] >= countD){
            points = points + (countD*2);
            remaining[3] = remaining[3] - (countD*1);
            setLeftD(String.valueOf(remaining[3]));
        }else{
            throw new Exception(String.format("Only %s letter d is available",remaining[3]));
        }
        return points;
    }

    private int runE(String word) throws Exception{
        Pattern e = Pattern.compile("([e])");
        Matcher eMatcher = e.matcher(word);
        int countE = 0;
        while(eMatcher.find()){
            countE++;
        }
        if(remaining[4] >= countE){
            points = points + (countE*1);
            remaining[4] = remaining[4] - (countE*1);
            setLeftE(String.valueOf(remaining[4]));
        }else{
            throw new Exception(String.format("Only %s letter e is available",remaining[4]));
        }
        return points;
    }

    private int runF(String word) throws Exception{
        Pattern f = Pattern.compile("([f])");
        Matcher fMatcher = f.matcher(word);
        int countF = 0;
        while(fMatcher.find()){
            countF++;
        }
        if(remaining[5] >= countF){
            points = points + (countF*4);
            remaining[5] = remaining[5] - (countF*1);
            setLeftF(String.valueOf(remaining[5]));
        }else{
            throw new Exception(String.format("Only %s letter f is available",remaining[5]));
        }
        return points;
    }


    private int runG(String word) throws Exception{
        Pattern g = Pattern.compile("([g])");
        Matcher gMatcher = g.matcher(word);
        int countG = 0;
        while(gMatcher.find()){
            countG++;
        }
        if(remaining[6] >= countG){
            points = points + (countG*2);
            remaining[6] = remaining[6] - (countG*1);
            setLeftG(String.valueOf(remaining[6]));
        }else{
            throw new Exception(String.format("Only %s letter g is available",remaining[6]));
        }
        return points;
    }

    private int runH(String word) throws Exception{
        Pattern h = Pattern.compile("([h])");
        Matcher hMatcher = h.matcher(word);
        int countH = 0;
        while(hMatcher.find()){
            countH++;
        }
        if(remaining[7] >= countH){
            points = points + (countH*4);
            remaining[7] = remaining[7] - (countH*1);
            setLeftH(String.valueOf(remaining[7]));
        }else{
            throw new Exception(String.format("Only %s letter h is available",remaining[7]));
        }
        return points;
    }

    private int runI(String word) throws Exception{
        Pattern i = Pattern.compile("([i])");
        Matcher iMatcher = i.matcher(word);
        int countI = 0;
        while(iMatcher.find()){
            countI++;
        }
        if(remaining[8] >= countI){
            points = points + (countI*1);
            remaining[8] = remaining[8] - (countI*1);
            setLeftI(String.valueOf(remaining[8]));
        }else{
            throw new Exception(String.format("Only %s letter i is available",remaining[8]));
        }
        return points;
    }

    private int runJ(String word) throws Exception{
        Pattern j = Pattern.compile("([j])");
        Matcher jMatcher = j.matcher(word);
        int countJ = 0;
        while(jMatcher.find()){
            countJ++;
        }
        if(remaining[9] >= countJ){
            points = points + (countJ*8);
            remaining[9] = remaining[9] - (countJ*1);
            setLeftJ(String.valueOf(remaining[9]));
        }else{
            throw new Exception(String.format("Only %s letter j is available",remaining[9]));
        }
        return points;
    }


    private int runK(String word) throws Exception{
        Pattern k = Pattern.compile("([k])");
        Matcher kMatcher = k.matcher(word);
        int countK = 0;
        while(kMatcher.find()){
            countK++;
        }
        if(remaining[10] >= countK){
            points = points + (countK*5);
            remaining[10] = remaining[10] - (countK*1);
            setLeftK(String.valueOf(remaining[10]));
        }else{
            throw new Exception(String.format("Only %s letter k is available",remaining[10]));
        }
        return points;
    }


    private int runL(String word) throws Exception{
        Pattern l = Pattern.compile("([l])");
        Matcher lMatcher = l.matcher(word);
        int countL = 0;
        while(lMatcher.find()){
            countL++;
        }
        if(remaining[11] >= countL){
            points = points + (countL*1);
            remaining[11] = remaining[11] - (countL*1);
            setLeftL(String.valueOf(remaining[11]));
        }else{
            throw new Exception(String.format("Only %s letter l is available",remaining[11]));
        }
        return points;
    }


    private int runM(String word) throws Exception{
        Pattern m = Pattern.compile("([m])");
        Matcher mMatcher = m.matcher(word);
        int countM = 0;
        while(mMatcher.find()){
            countM++;
        }
        if(remaining[12] >= countM){
            points = points + (countM*3);
            remaining[12] = remaining[12] - (countM*1);
            setLeftM(String.valueOf(remaining[12]));
        }else{
            throw new Exception(String.format("Only %s letter m is available",remaining[12]));
        }
        return points;
    }

    private int runN(String word) throws Exception{
        Pattern n = Pattern.compile("([n])");
        Matcher nMatcher = n.matcher(word);
        int countN = 0;
        while(nMatcher.find()){
            countN++;
        }
        if(remaining[13] >= countN){
            points = points + (countN*1);
            remaining[13] = remaining[13] - (countN*1);
            setLeftN(String.valueOf(remaining[13]));
        }else{
            throw new Exception(String.format("Only %s letter n is available",remaining[13]));
        }
        return points;
    }

    private int runO(String word) throws Exception{
        Pattern o = Pattern.compile("([o])");
        Matcher oMatcher = o.matcher(word);
        int countO = 0;
        while(oMatcher.find()){
            countO++;
        }
        if(remaining[14] >= countO){
            points = points + (countO*1);
            remaining[14] = remaining[14] - (countO*1);
            setLeftO(String.valueOf(remaining[14]));
        }else{
            throw new Exception(String.format("Only %s letter o is available",remaining[14]));
        }
        return points;
    }

    private int runP(String word) throws Exception{
        Pattern p = Pattern.compile("([p])");
        Matcher pMatcher = p.matcher(word);
        int countP = 0;
        while(pMatcher.find()){
            countP++;
        }
        if(remaining[15] >= countP){
            points = points + (countP*3);
            remaining[15] = remaining[15] - (countP*1);
            setLeftP(String.valueOf(remaining[15]));
        }else{
            throw new Exception(String.format("Only %s letter p is available",remaining[15]));
        }
        return points;
    }

    private int runQ(String word) throws Exception{
        Pattern q = Pattern.compile("([q])");
        Matcher qMatcher = q.matcher(word);
        int countQ = 0;
        while(qMatcher.find()){
            countQ++;
        }
        if(remaining[16] >= countQ){
            points = points + (countQ*10);
            remaining[16] = remaining[16] - (countQ*1);
            setLeftQ(String.valueOf(remaining[16]));
        }else{
            throw new Exception(String.format("Only %s letter q is available",remaining[16]));
        }
        return points;
    }


    private int runR(String word) throws Exception{
        Pattern r = Pattern.compile("([r])");
        Matcher rMatcher = r.matcher(word);
        int countR = 0;
        while(rMatcher.find()){
            countR++;
        }
        if(remaining[17] >= countR){
            points = points + (countR*1);
            remaining[17] = remaining[17] - (countR*1);
            setLeftR(String.valueOf(remaining[17]));
        }else{
            throw new Exception(String.format("Only %s letter r is available",remaining[17]));
        }
        return points;
    }

    private int runS(String word) throws Exception{
        Pattern s = Pattern.compile("([s])");
        Matcher sMatcher = s.matcher(word);
        int countS = 0;
        while(sMatcher.find()){
            countS++;
        }
        if(remaining[18] >= countS){
            points = points + (countS*1);
            remaining[18] = remaining[18] - (countS*1);
            setLeftS(String.valueOf(remaining[18]));
        }else{
            throw new Exception(String.format("Only %s letter s is available",remaining[18]));
        }
        return points;
    }

    private int runT(String word) throws Exception{
        Pattern t = Pattern.compile("([t])");
        Matcher tMatcher = t.matcher(word);
        int countT = 0;
        while(tMatcher.find()){
            countT++;
        }
        if(remaining[19] >= countT){
            points = points + (countT*1);
            remaining[19] = remaining[19] - (countT*1);
            setLeftT(String.valueOf(remaining[19]));
        }else{
            throw new Exception(String.format("Only %s letter t is available",remaining[19]));
        }
        return points;
    }


    private int runU(String word) throws Exception{
        Pattern u = Pattern.compile("([u])");
        Matcher uMatcher = u.matcher(word);
        int countU = 0;
        while(uMatcher.find()){
            countU++;
        }
        if(remaining[20] >= countU){
            points = points + (countU*1);
            remaining[20] = remaining[20] - (countU*1);
            setLeftU(String.valueOf(remaining[20]));
        }else{
            throw new Exception(String.format("Only %s letter u is available",remaining[20]));
        }
        return points;
    }


    private int runV(String word) throws Exception{
        Pattern v = Pattern.compile("([v])");
        Matcher vMatcher = v.matcher(word);
        int countV = 0;
        while(vMatcher.find()){
            countV++;
        }
        if(remaining[21] >= countV){
            points = points + (countV*4);
            remaining[21] = remaining[21] - (countV*1);
            setLeftV(String.valueOf(remaining[21]));
        }else{
            throw new Exception(String.format("Only %s letter v is available",remaining[21]));
        }
        return points;
    }


    private int runW(String word) throws Exception{
        Pattern w = Pattern.compile("([w])");
        Matcher wMatcher = w.matcher(word);
        int countW = 0;
        while(wMatcher.find()){
            countW++;
        }
        if(remaining[22] >= countW){
            points = points + (countW*4);
            remaining[22] = remaining[22] - (countW*1);
            setLeftW(String.valueOf(remaining[22]));
        }else{
            throw new Exception(String.format("Only %s letter w is available",remaining[22]));
        }
        return points;
    }


    private int runX(String word) throws Exception{
        Pattern x = Pattern.compile("([x])");
        Matcher xMatcher = x.matcher(word);
        int countX = 0;
        while(xMatcher.find()){
            countX++;
        }
        if(remaining[23] >= countX){
            points = points + (countX*8);
            remaining[23] = remaining[23] - (countX*1);
            setLeftX(String.valueOf(remaining[23]));
        }else{
            throw new Exception(String.format("Only %s letter x is available",remaining[23]));
        }
        return points;
    }

    private int runY(String word) throws Exception{
        Pattern y = Pattern.compile("([y])");
        Matcher yMatcher = y.matcher(word);
        int countY = 0;
        while(yMatcher.find()){
            countY++;
        }
        if(remaining[24] >= countY){
            points = points + (countY*4);
            remaining[24] = remaining[24] - (countY*1);
            setLeftY(String.valueOf(remaining[24]));
        }else{
            throw new Exception(String.format("Only %s letter y is available",remaining[24]));
        }
        return points;
    }


    private int runZ(String word) throws Exception{
        Pattern z = Pattern.compile("([z])");
        Matcher zMatcher = z.matcher(word);
        int countZ = 0;
        while(zMatcher.find()){
            countZ++;
        }
        if(remaining[25] >= countZ){
            points = points + (countZ*10);
            remaining[25] = remaining[25] - (countZ*1);
            setLeftZ(String.valueOf(remaining[25]));
        }else{
            throw new Exception(String.format("Only %s letter z is available",remaining[25]));
        }
        return points;
    }

}
