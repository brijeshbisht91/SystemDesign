package DTDL;

public class sampleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test_str = "DFDF10FDFDF100EFEFF90";

//		char[] ch = test_str.toCharArray();

		int j = 0;

		int sum = 0;

		for (int i = 0; i < test_str.length(); i++) {

			if (Character.toString(test_str.charAt(i)).toLowerCase()
					.equals(Character.toString(test_str.charAt(i)).toUpperCase())) {

				j = i;

				while (j < test_str.length()) {

					if (Character.toString(test_str.charAt(j)).toLowerCase()
							.equals(Character.toString(test_str.charAt(j)).toUpperCase())) {
						j++;

					} else {
						String val = test_str.substring(i, j);

						System.out.print(val);
						sum = sum + Integer.parseInt(val);

						i = j;
						break;
					}

				}

			} else {
				j++;
			}

		}

		System.out.print(sum + sum);

	}

}
