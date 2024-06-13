package user;
public interface IUserController<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
