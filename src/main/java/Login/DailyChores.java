/*This is just a starting class where i define what a person needs to do when he used minimalism 
and what his day habits should be and what is weekly habits should be based on that

Everyone can decide those above things based on their off days and this will be built only for full working indivialus who
work 40 hours a week regardless of their shift*/

/*Digital projects
Digital Decluttering Tools or Methods: Create resources to help others declutter their digital lives, such as guides on organizing photos, streamlining emails, managing notifications, or curating social media feeds.
Minimalist Habit Tracker: Develop a simple habit tracker app or template (e.g., in Notion) that focuses on tracking core habits without complex features, helping users build consistency with their routines.
Eco-App for Reducing Waste: Build an app connecting people to local waste banks, refill stations, or for sharing and renting infrequently used items to reduce consumption.
Home projects
Minimalist Home Organization Systems: Develop DIY solutions for home organization based on minimalist principles, like utilizing vertical space, repurposing old items (jars, crates), or creating hidden storage.
Zero-Waste Home Decor: Explore and create decor items using sustainable materials and upcycling techniques, like beeswax wraps, newspaper seed pots, or t-shirt tote bags.
Creative projects
Sustainable Clothing Brand or Capsule Wardrobe Service: Design and create versatile, high-quality clothing pieces made from sustainable materials, focusing on building a capsule wardrobe concept for customers.

Work on above and will add as follows*/

@Entity
@Table(name = "Daily Chores")
public class DailyChores{
/*I will refrence the ID coloum form other coloumn as a refrence id so the they cannot duplicate that as well and also need to work on just getting the coloumn from other and used in this
  and I have find this way to do it but I will do it on my own as well but check via chatgpt*/
  @Id
  @GeneratedValue(startegy = GenerationType.IDENTITY)
  private Long id;

  @ManytoOne
  @JoinColumn(name = "Id_id)//Foriegn key coloumn
  private Id id;//Refrence to ID entity

  //Add all constructor and getters and setters here
}
