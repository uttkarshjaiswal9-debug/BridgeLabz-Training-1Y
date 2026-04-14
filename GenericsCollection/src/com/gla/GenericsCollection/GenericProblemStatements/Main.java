package com.gla.GenericsCollection.GenericProblemStatements;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer Value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String Value: " + strBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.99);
        System.out.println("Double Value: " + doubleBox.get());

        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println(student.getFirst());
        System.out.println(student.getSecond());

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.display();

        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Mobile"));

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));

        System.out.println("Electronics Cart:");
        electronicsCart.displayItems();

        System.out.println("Clothing Cart:");
        clothingCart.displayItems();

        List<Mobile> mobiles = Arrays.asList(
                new Mobile(10000),
                new Mobile(15000)
        );

        List<Laptop> laptops = Arrays.asList(
                new Laptop(50000),
                new Laptop(70000)
        );

        System.out.println(PriceCalculator.calculateTotal(mobiles));
        System.out.println(PriceCalculator.calculateTotal(laptops));

        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Tata Truck"));
        truckFleet.addVehicle(new Truck("Ashok Leyland"));
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Royal Enfield"));
        bikeFleet.addVehicle(new Bike("Yamaha"));
        bikeFleet.showFleet();

        Storage<Electronic> eStore = new Storage<>();
        eStore.addItem(new Electronic("Laptop"));
        eStore.addItem(new Electronic("Mobile"));

        Storage<Groceries> gStore = new Storage<>();
        gStore.addItem(new Groceries("Rice"));
        gStore.addItem(new Groceries("Milk"));

        Storage<Furniture> fStore = new Storage<>();
        fStore.addItem(new Furniture("Chair"));
        fStore.addItem(new Furniture("Table"));

        WarehouseUtil.displayItems(eStore.getItems());
        WarehouseUtil.displayItems(gStore.getItems());
        WarehouseUtil.displayItems(fStore.getItems());

        GenericProduct<BookCategory> book =
                        new GenericProduct<>("Java Book", 500, new BookCategory("Education"));

                GenericProduct<ClothingCategory> cloth =
                        new GenericProduct<>("T-Shirt", 1000, new ClothingCategory("Fashion"));

                GenericProduct<GadgetCategory> gadget =
                        new GenericProduct<>("Mobile", 20000, new GadgetCategory("Electronics"));

                MarketplaceUtil.applyDiscount(book, 10);
                MarketplaceUtil.applyDiscount(cloth, 20);
                MarketplaceUtil.applyDiscount(gadget, 5);

                Catalog catalog = new Catalog();
                catalog.addProduct(book);
                catalog.addProduct(cloth);
                catalog.addProduct(gadget);

                catalog.display();

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Maths"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Java"));
        assignmentCourses.addCourse(new AssignmentCourse("DBMS"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI"));
        researchCourses.addCourse(new ResearchCourse("ML"));

        CourseUtil.displayCourses(examCourses.getCourses());
        CourseUtil.displayCourses(assignmentCourses.getCourses());
        CourseUtil.displayCourses(researchCourses.getCourses());

        Meal<VegetarianMeal> vegMeal = new Meal<>();
        MealUtil.generateMeal(vegMeal, new VegetarianMeal());

        Meal<VeganMeal> veganMeal = new Meal<>();
        MealUtil.generateMeal(veganMeal, new VeganMeal());

        Meal<KetoMeal> ketoMeal = new Meal<>();
        MealUtil.generateMeal(ketoMeal, new KetoMeal());

        Meal<HighProteinMeal> hpMeal = new Meal<>();
        MealUtil.generateMeal(hpMeal, new HighProteinMeal());

        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(new SoftwareEngineer("Backend Developer"));
        seResumes.addResume(new SoftwareEngineer("Frontend Developer"));

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(new DataScientist("ML Engineer"));
        dsResumes.addResume(new DataScientist("Data Analyst"));

        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addResume(new ProductManager("Associate PM"));
        pmResumes.addResume(new ProductManager("Senior PM"));

        ScreeningUtil.screen(seResumes.getResumes());
        ScreeningUtil.screen(dsResumes.getResumes());
        ScreeningUtil.screen(pmResumes.getResumes());


            }
        }
