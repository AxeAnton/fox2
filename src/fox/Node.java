package fox;

import java.io.Serializable;
import java.util.Objects;

public class Node {
        String UnName;
        String text;
        String option1;
        String option2;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node node = (Node) o;
            return getUnName().equals(node.getUnName()) && getText().equals(node.getText()) && getOption1().equals(node.getOption1()) && getOption2().equals(node.getOption2());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getUnName(), getText(), getOption1(), getOption2());
        }

        public Node(String unName, String text, String potion1, String potion2) {
            UnName = unName;
            this.text = text;
            this.option1 = potion1;
            this.option2 = potion2;
        }

        public String getUnName() {
            return UnName;
        }

        public void setUnName(String unName) {
            UnName = unName;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getOption1() {
            return option1;
        }

        public void setOption1(String option1) {
            this.option1 = option1;
        }

        public String getOption2() {
            return option2;
        }

        public void setOption2(String option2) {
            this.option2 = option2;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "UnName='" + UnName + '\'' +
                    ", text='" + text + '\'' +
                    ", potion1='" + option1 + '\'' +
                    ", potion2='" + option2 + '\'' +
                    '}';
        }
    }
