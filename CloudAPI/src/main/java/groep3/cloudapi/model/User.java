package groep3.cloudapi.model;

import java.util.Date;
import java.util.List;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

@Entity (value = "users")
public class User extends EntityModel
{
    String name;
    String telephone;
    String email;
    String password;
    int collectedPoints;
    Role role;
    
    @Reference
    List<Module> modules;
    
    @Reference
    List<User> contacts;
    
    String image;
    
    Date creationDate;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getCollectedPoints()
    {
        return collectedPoints;
    }

    public void setCollectedPoints(int collectedPoints)
    {
        this.collectedPoints = collectedPoints;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    public List<Module> getModules()
    {
        return modules;
    }

    public void setModules(List<Module> modules)
    {
        this.modules = modules;
    }

    public List<User> getContacts()
    {
        return contacts;
    }

    public void setContacts(List<User> contacts)
    {
        this.contacts = contacts;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }
}
