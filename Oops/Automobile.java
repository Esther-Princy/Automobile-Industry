import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import Industry.Texture;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Automobile {
    public String transportName;
    public String brandName;
    private float f;
    private double distance;
    private double pf, fr;

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public class Movement {
        private int speedControl;
        private String mechanism;

        public int getSpeedControl() {
            return speedControl;
        }

        public void setSpeedControl(int speedControl) {
            this.speedControl = speedControl;
        }

        public String getMechanism() {
            return mechanism;
        }

        public void setMechanism(String mechanism) {
            this.mechanism = mechanism;
        }
    }

    public class Finance {
        private float profit;
        private float investment;

        public float getInvestment() {
            return investment;
        }

        public void setInvestment(float investment) {
            this.investment = investment;
        }

        public float getProfit(float profitPercentage) {
            return investment + (profitPercentage / 100) * investment;
        }

        public float getProfit() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Profit Percentage: ");
            float profitPercentage = scanner.nextFloat();
            return getProfit(profitPercentage);
        }

        public void setProfit(float profit) {
            this.profit = profit;
        }
    }

    public class Law {
        private int failures;
        private float penalty;
        private double CriminalLaw;
        private double CivilLaw;
        public int z, y;

        public void method() {
            System.out.println("Now we see about failures, penalty in this case");
        }

        public int getFailures() {
            return failures;
        }

        public void setFailures(int failures) {
            this.failures = failures;
        }

        public float getPenalty() {
            return penalty;
        }

        public void setPenalty(float penalty) {
            this.penalty = penalty;
        }

        public class CriminalLaw extends Law {
            public void display1() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter fine amount:");
                double fa = sc.nextDouble();
                System.out.println("Enter penalty percentage:");
                double pp = sc.nextDouble();
                pf = (fa * pp) / 100.0;
            }

            public int calculatefees(int charge1, int percent) {
                z = charge1 * percent;
                return z;
            }
        }

        public class SubstantiveLaw extends CriminalLaw {
            public void display2() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter case lost:");
                int cl = sc.nextInt();
                System.out.println("Enter total cases:");
                int tc = sc.nextInt();
                fr = ((double) cl / tc) * 100;
            }

            public int calculatefees(int charge2, int discount) {
                y = charge2 - discount;
                return y;
            }
        }
    }

    public class Sensor {
        private int radioWaves;
        private int camera;
        private int GateSensor;
        private int frequency;

        public int getRadioWaves() {
            return radioWaves;
        }

        public void setRadioWaves(int radioWaves) {
            this.radioWaves = radioWaves;
        }

        public int getCamera() {
            return camera;
        }

        public void setCamera(int camera) {
            this.camera = camera;
        }

        public class GateSensor extends Sensor {
            public void display4() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter occurrences:");
                int o = sc.nextInt();
                System.out.println("Enter time in seconds:");
                int t = sc.nextInt();
                f = (float) o / t;
            }
        }

        public class VehicleSensor extends Sensor {
            public void display3() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Vehicle 1 Frequency: ");
                double vehicle1Frequency = scanner.nextDouble();
                System.out.print("Enter Vehicle 2 Frequency: ");
                double vehicle2Frequency = scanner.nextDouble();
                System.out.print("Enter Speed of Light: ");
                double speedoflight = scanner.nextDouble();
                double time = 1 / (2 * Math.max(vehicle1Frequency, vehicle2Frequency));
                distance = (speedoflight * time) / 2;
            }
        }
    }

    public class Company {
        private String idea;
        public String person;

        public String getIdea() {
            return idea;
        }

        public void setIdea(String idea) {
            this.idea = idea;
        }

        public String getPerson() {
            return person;
        }

        public void setPerson(String person) {
            this.person = person;
        }
    }

    public static class Designer {
        int exp;
        String dname;

        public Designer(int exp, String dname) {
            this.exp = exp;
            this.dname = dname;
        }

        public String toString() {
            return exp + " " + dname;
        }
    }
	

    public static class Thread1 extends Thread {
        public String[] states;
		private HashMap<String, String> stateOwnerMap;

        public Thread1(String[] states,HashMap<String, String> stateOwnerMap) {
            this.states = states;
			this.stateOwnerMap=stateOwnerMap;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("State name is " + states[i]);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }

    public static class Thread2 extends Thread {
        public String[] Oname;

        public Thread2(String[] Oname) {
            this.Oname = Oname;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Name of the owner is " + Oname[i]);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }
	public static class Speedometer
	{
		private int hours;
		private String driver;
		private int totdis;
		Speedometer(String driver,int hours,int totdis)
		{
			this.hours=hours;
			this.driver=driver;
			this.totdis=totdis;
		}
		public int getTotalHours()
		{
			return hours;
		}
		public String getDriverName()
		{
			return driver;
		}
		public int getTotalDistance()
		{
			return totdis;
		}
	}
	private static final Logger logger=Logger.getLogger(Automobile.class.getName());
	 private static Scanner scanner = new Scanner(System.in);

  public static class Simple extends Frame {
   Simple() {
        Label nameLabel = new Label("Name");
        nameLabel.setBounds(50, 50, 100, 30);
        TextField nameTextField = new TextField("Enter name");
        nameTextField.setBounds(170, 50, 150, 30);

        Label ageLabel = new Label("Age");
        ageLabel.setBounds(50, 100, 100, 30);
        TextField ageTextField = new TextField("Enter age");
        ageTextField.setBounds(170, 100, 150, 30);

        Label vehicleLabel = new Label("Vehicle");
        vehicleLabel.setBounds(50, 150, 100, 30);
        Checkbox bikeCheckbox = new Checkbox("Bike");
        bikeCheckbox.setBounds(170, 150, 50, 30);
        Checkbox carCheckbox = new Checkbox("Car");
        carCheckbox.setBounds(230, 150, 60, 30);
        Checkbox truckCheckbox = new Checkbox("Truck");
        truckCheckbox.setBounds(290, 150, 60, 30);
        Checkbox lorryCheckbox = new Checkbox("Lorry");
        lorryCheckbox.setBounds(350, 150, 60, 30);

        Label genderLabel = new Label("Gender");
        genderLabel.setBounds(50, 200, 100, 30);
        Choice genderChoice = new Choice();
        genderChoice.add("Female");
        genderChoice.add("Male");
        genderChoice.setBounds(170, 200, 150, 30);

        Button submitButton = new Button("Submit");
        submitButton.setBounds(150, 250, 100, 30);

        ActionListener submitListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Name: " + nameTextField.getText());
                System.out.println("Age: " + ageTextField.getText());
                System.out.println("Gender: " + genderChoice.getSelectedItem());
                System.out.println("Vehicle: "
                        + (bikeCheckbox.getState() ? "Bike" : "")
                        + (carCheckbox.getState() ? "Car" : "")
                        + (truckCheckbox.getState() ? "Truck" : "")
                        + (lorryCheckbox.getState() ? "Lorry" : ""));
            }
        };
        submitButton.addActionListener(submitListener);

        add(nameLabel);
        add(ageLabel);
        add(vehicleLabel);
        add(genderLabel);
        add(nameTextField);
        add(ageTextField);
        add(bikeCheckbox);
        add(carCheckbox);
        add(truckCheckbox);
        add(lorryCheckbox);
        add(genderChoice);
        add(submitButton);

        setLayout(null);
        setVisible(true);
        setSize(450, 350);
        setTitle("Automobile app");
    }
    }
    public static void main(String[] args) {
        new Simple();

        class EngineFailureException extends Exception {
            public EngineFailureException() {
                super("CRITICAL ENGINE FAILURE DETECTED...");
            }
        }

        Scanner scanner = new Scanner(System.in);
        Automobile automobile = new Automobile();
        scanner.nextLine();
        System.out.print("Enter Transport Name: ");
        String transportName = scanner.nextLine();
        automobile.setTransportName(transportName);

        System.out.print("Enter Brand Name: ");
        String brandName = scanner.nextLine();
        automobile.setBrandName(brandName);

        System.out.print("Enter Color Technology: ");
        String colorTech = scanner.nextLine();

        Texture color = new Texture();
        color.setAppliedTechnology(colorTech);

        System.out.print("Enter Color Mixing: ");
        String colorMixing = scanner.nextLine();
        color.setColorMixing(colorMixing);

        System.out.print("Enter area: ");
        double ar = scanner.nextDouble();
        System.out.print("Enter thickness: ");
        float thick = scanner.nextFloat();
        double ans = color.painting(ar, thick);

        System.out.print("Enter cost per litre: ");
        int costofpaint = scanner.nextInt();
        double amt = color.totalcost(ans, costofpaint);

        Automobile.Movement speed = automobile.new Movement();

        try {
            System.out.print("Enter Speed Control: ");
            int speedControl = scanner.nextInt();
            if (speedControl < 0 || speedControl > 180) {
                speed.setSpeedControl(speedControl);
                throw new EngineFailureException();
            }
        } catch (EngineFailureException e) {
            System.out.println(e.getMessage());
            scanner.nextLine();
        }

        System.out.print("Enter Speed Mechanism: ");
        scanner.nextLine();
        String speedMechanism = scanner.nextLine();
        speed.setMechanism(speedMechanism);

        Automobile.Finance finance = automobile.new Finance();
        System.out.print("Enter Investment Amount: ");
        float investment = scanner.nextFloat();
        finance.setInvestment(investment);

        float profit = finance.getProfit();

        Automobile.Law law = automobile.new Law();
        law.method();

        System.out.print("Enter Number of Failures: ");
        int failures = scanner.nextInt();
        law.setFailures(failures);

        System.out.print("Enter Penalty Amount: ");
        float penalty = scanner.nextFloat();
        law.setPenalty(penalty);

        Automobile.Law.CriminalLaw clCriminal = law.new CriminalLaw();
        System.out.println("Enter charge fees");
        int charge = scanner.nextInt();
        System.out.println("Enter percent");
        int per = scanner.nextInt();
        clCriminal.display1();

        Automobile.Law.SubstantiveLaw sub = law.new SubstantiveLaw();
        System.out.println("Enter charge fees");
        int charg = scanner.nextInt();
        System.out.println("Enter discount");
        int dic = scanner.nextInt();
        sub.display2();

        Automobile.Sensor sensor = automobile.new Sensor();
        System.out.print("Enter frequency of Radio Waves: ");
        int radioWaves = scanner.nextInt();
        sensor.setRadioWaves(radioWaves);

        System.out.print("Enter Number of Cameras: ");
        int camera = scanner.nextInt();
        sensor.setCamera(camera);

        Automobile.Sensor.GateSensor gatesensor = sensor.new GateSensor();
        gatesensor.display4();

        Automobile.Sensor.VehicleSensor vehicleSensor = sensor.new VehicleSensor();
        vehicleSensor.display3();

        Automobile.Company company = automobile.new Company();
        scanner.nextLine();
        System.out.print("Enter Company Idea: ");
        String idea = scanner.nextLine();
        company.setIdea(idea);

        System.out.print("Enter Person in Charge: ");
        String person = scanner.nextLine();
        company.setPerson(person);

        Designer d1 = new Designer(5, "Rajkumar");
        Designer d2 = new Designer(7, "Riya");
        Designer d3 = new Designer(2, "Karthick");
        Designer d4 = new Designer(11, "Sai");
        Designer d5 = new Designer(9, "Darvinci");
        Designer d6 = new Designer(8, "Mona");

        ArrayList<Designer> al = new ArrayList<>();
        al.add(d1);
        al.add(d2);
        al.add(d3);
        al.add(d4);
        al.add(d5);
        al.add(d6);
        System.out.println("The total objects: " + al.size());
        System.out.println(al);

        Iterator<Designer> it = al.iterator();
        while (it.hasNext()) {
            Designer ele = it.next();
            if (ele.exp < 6) {
                it.remove();
            }
        }
        System.out.println("The list after removing the people with less than 6 years of experience is: " + al);
        System.out.println("Transport Name is : " + automobile.getTransportName());
        System.out.println("Brand Name is : " + automobile.getBrandName());
        System.out.println("Color Technology is: " + color.getAppliedTechnology());
        System.out.println("Color Mixing is : " + color.getColorMixing());
        System.out.println("The amount of paint needed is : " + ans);
        System.out.println("The total cost of paint used is : " + amt);
        System.out.println("Speed Control is : " + speed.getSpeedControl());
        System.out.println("Speed Mechanism is : " + speed.getMechanism());
        System.out.println("Investment Amount is: " + finance.getInvestment());
        System.out.println("Profit is: " + profit);
        System.out.println("Number of Failures: " + law.getFailures());
        System.out.println("Penalty Amount: " + law.getPenalty());
        System.out.println("Lawyer who is dealing criminal law charge is " + clCriminal.calculatefees(charge, per));
        System.out.println("Criminal law penalty fee: $ " + automobile.pf);
        System.out.println("Lawyer who is dealing substantive law charge is " + sub.calculatefees(charg, dic));
        System.out.println("Substantive law failure rate: " + automobile.fr + "%");
        System.out.println("Number of Radio Waves: " + sensor.getRadioWaves());
        System.out.println("Number of Cameras: " + sensor.getCamera());
        System.out.println("Frequency of radio waves between gate and vehicle: " + automobile.f);
        System.out.println("The distance between two vehicles is: " + automobile.distance);
        System.out.println("Company Idea: " + company.getIdea());
        System.out.println("Person in Charge: " + company.getPerson());

        try {
            FileInputStream fin = new FileInputStream("file.txt");

            int u = 0;
            StringBuilder ss = new StringBuilder();

            while ((u = fin.read()) != -1) {
                System.out.print((char) u);
                ss.append((char) u);
            }
            String content = ss.toString();
			
            System.out.println("\nLines ending with '$':");
            String[] lines = content.split("\n");
            for (String line : lines) {
                if (line.trim().endsWith("$")) {
                    System.out.println(line);
                }
            }
			System.out.println("Enter the name");
			String dhan=scanner.nextLine();
			for (String line : lines) {
			if(line.trim().toLowerCase().contains(dhan.toLowerCase()))
				{
					System.out.println(line);
					break;
				}
			}
			StringBuilder an = new StringBuilder();
			int max=Integer.MIN_VALUE;
			
			String cust="";
			for (String line : lines) {
				int frstspace=line.indexOf(' ');
				int secspace=line.indexOf(' ',frstspace+1);
				int firstdel = line.indexOf(':');
				int secdel = line.indexOf(':', firstdel + 1);
				if(firstdel!=-1 && secdel!=-1)
				{
					String value =line.substring(secdel+1).trim();
					an.append(value).append("\n");
					int bp=Integer.parseInt(value);
					if(bp>max)
					{
						max=bp;
						cust = line.substring(firstdel + 1, secspace).trim();
					}
				}
			}
			System.out.println("\nThe bought prices are:\n" + an);
            System.out.println("\nCustomer with the maximum bought price is: " + cust);
            System.out.println("Max Bought Price: " + max);
			
			fin.close();
        } catch (IOException e) {
            System.out.println(e);
        }
		 String[] states = new String[5];
        String[] Oname = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the state");
            states[i] = scanner.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of the owner");
            Oname[i] = scanner.nextLine();
        }
		HashMap<String, String> stateOwnerMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            stateOwnerMap.put(states[i], Oname[i]);
        }
        Thread1 th1 = new Thread1(states, stateOwnerMap);
        Thread2 th2 = new Thread2(Oname);
        th1.start();
        th2.start();
		scanner.nextLine();
		
		System.out.println("Enter the num of people driving:");
        int q = scanner.nextInt();
        Speedometer ssp[] = new Speedometer[q];
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the person" + (i + 1) + " driving:");
            String pil = scanner.nextLine();
            System.out.println("Enter the person" + (i + 1) + " travelled hours:");
            int hrs = scanner.nextInt();
            System.out.println("Enter the person" + (i + 1) + " travelled total distance in kms:");
            int km = scanner.nextInt();

            ssp[i] = new Speedometer(pil, hrs, km);
			scanner.nextLine();
        }
        for (Speedometer slc : ssp) {
            checkspeed(slc);
        }
    }

    static Speedometer checkspeed(Speedometer us) {
        double error = (double) us.getTotalDistance() / us.getTotalHours();
        if (error <= 45) {
            logNormalEngineHeat(us, error);
        } else if (error > 45 && error <= 75) {
            logMediumHeatIssue(us, error);
        } else {
            logOverheatingOfEngineIssue(us, error);
        }
        return us;
    }

    private static void logNormalEngineHeat(Speedometer us, double error) {
        logger.info("The person " + us.getDriverName() + " who drives the total distance of " +
                us.getTotalDistance() + " in a total hours of " + us.getTotalHours() +
                " gets the engine heat rate of " + error);
    }

    private static void logMediumHeatIssue(Speedometer us, double error) {
        logger.warning("The person " + us.getDriverName() + " who drives the total distance of " +
                us.getTotalDistance() + " in a total hours of " + us.getTotalHours() +
                " gets the engine heat rate of " + error);
    }

    private static void logOverheatingOfEngineIssue(Speedometer us, double error) {
        logger.severe("The person " + us.getDriverName() + " who drives the total distance of " +
                us.getTotalDistance() + " in a total hours of " + us.getTotalHours() +
                " gets the engine heat rate of " + error);
    }
}