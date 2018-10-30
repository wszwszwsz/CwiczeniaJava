    public enum Size{
        SMALL("Maly"), MEDIUM("Sredni"), LARGE("Duzy");

        private String description;

        Size(String desc) {
            description = desc;
        }

        public String getDescription(){
            return description;
        }
    }

