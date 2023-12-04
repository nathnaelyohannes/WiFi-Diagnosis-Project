
import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) {
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		Scanner input = new Scanner(System.in);
		System.out.println("First step: reboot your computer\n"
				+ "Are you able to connect with the internet? (yes or no)");
		String reboot = input.next().toLowerCase();
		if (reboot.startsWith("y")) {
			System.out.println("Rebooting your computer seemed to work");
		}
		else if (reboot.startsWith("n")) {
			System.out.println("Second step: reboot your router\n"
					+ "Now are you able to connect with the internet? (yes or no)");
			String router = input.next().toLowerCase();
			if (router.startsWith("y")) {
				System.out.println("Rebooting your router seemed to work");
			}
			else if (router.startsWith("n")) {
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\n"
						+ "Now are you able to connect with the internet? (yes or no)");
				String cables = input.next().toLowerCase();
				if (cables.startsWith("y")) {
					System.out.println("Checking the router's cables seemed to work");
				}
				else if (cables.startsWith("n")) {
					System.out.println("Fourth step: move your computer closer to your router\n"
							+ "Now are you able to connect with the internet? (yes or no)");
					String close = input.next().toLowerCase();
					if (close.startsWith("y")) {
						System.out.println("moving your computer closer seemed to work");
					}
					else if (close.startsWith("n")) {
						System.out.println("Fifth step: contact your ISP\n"
								+ "Make sure your ISP is hooked up to your router");
					}
				}
				
			}
		}
		System.out.println("\nProgrammer: Nathnael Yohannes");
	}

}
