package TemplateMethodMode;

/**
 * 考试类，包含方法和题目
 */
public abstract class Exam {

    /**
     * 回答
     *
     * @return
     */
    public abstract Option answer();

    public void question1() {
        System.out.println("开车走左边还是走右边？");
        System.out.println("a.左边; b.右边");
        System.out.println("你的答案是: " + answer());
    }
}
