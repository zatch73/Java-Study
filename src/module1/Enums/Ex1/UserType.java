package Enums.Ex1;

public enum UserType {
    ADMIN {
        @Override
        public String toString() {
            return "Admin";
        }
    },
    USER {
        @Override
        public String toString() {
            return "User";
        }
    };

}
