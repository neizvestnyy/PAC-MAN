package application;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Constants {

	// board
	public static final int BOARD_WIDTH = 28;
	public static final int BOARD_HEIGHT = 31;
	// path
	private static final String IMG_PATH = "img/";
	private static final String SND_PATH = "snd/";
	// images
	public static final Image PACMAN_PICTURE = new Image(IMG_PATH + "pacman.png");
	public static final Image WALL_PICTURE = new Image(IMG_PATH + "wall.png");
	public static final Image VOID_PICTURE = new Image(IMG_PATH + "void.png");
	public static final Image DOOR_PICTURE = new Image(IMG_PATH + "door.png");
	public static final Image DOT_PICTURE = new Image(IMG_PATH + "dot.png");
	public static final Image ENERGIZER_PICTURE = new Image(IMG_PATH + "energizer.png");
//	public static final Image CHERRY_PICTURE = new Image(IMG_PATH + "cherry.png");
//	public static final Image STRAWBERRY_PICTURE = new Image(IMG_PATH + "strawberry.png");
//	public static final Image PEACH_PICTURE = new Image(IMG_PATH + "peach.png");
//	public static final Image APPLE_PICTURE = new Image(IMG_PATH + "apple.png");
//	public static final Image GRAPE_PICTURE = new Image(IMG_PATH + "grape.png");
//	public static final Image GALAXIAN_PICTURE = new Image(IMG_PATH + "galaxian.png");
//	public static final Image BELL_PICTURE = new Image(IMG_PATH + "bell.png");
//	public static final Image KEY_PICTURE = new Image(IMG_PATH + "key.png");
	// images views
//	public static final ImageView WALL_VIEW = new ImageView(WALL_PICTURE);
//	public static final ImageView VOID_VIEW = new ImageView(VOID_PICTURE);
//	public static final ImageView DOOR_VIEW = new ImageView(DOOR_PICTURE);
//	public static final ImageView DOT_VIEW = new ImageView(DOT_PICTURE);
//	public static final ImageView ENERGIZER_VIEW = new ImageView(ENERGIZER_PICTURE);
//	public static final ImageView CHERRY_VIEW = new ImageView(CHERRY_PICTURE);
//	public static final ImageView STRAWBERRY_VIEW = new ImageView(STRAWBERRY_PICTURE);
//	public static final ImageView PEACH_VIEW = new ImageView(PEACH_PICTURE);
//	public static final ImageView APPLE_VIEW = new ImageView(APPLE_PICTURE);
//	public static final ImageView GRAPE_VIEW = new ImageView(GRAPE_PICTURE);
//	public static final ImageView GALAXIAN_VIEW = new ImageView(GALAXIAN_PICTURE);
//	public static final ImageView BELL_VIEW = new ImageView(BELL_PICTURE);
//	public static final ImageView KEY_VIEW = new ImageView(KEY_PICTURE);
	// sounds
	private static final Media CHOMP_SOUND = new Media(new File(SND_PATH + "pacman_chomp.wav").toURI().toString());
	private static final Media EAT_GHOST_SOUND = new Media(new File(SND_PATH + "pacman_eatghost.wav").toURI().toString());
	private static final Media EAT_FRUIT_SOUND = new Media(new File(SND_PATH + "pacman_eatfruit.wav").toURI().toString());
	private static final Media DEATH_SOUND = new Media(new File(SND_PATH + "pacman_death.wav").toURI().toString());
	private static final Media BEGINNING_SOUND = new Media(new File(SND_PATH + "pacman_beginning.wav").toURI().toString());
	// media players
	public static final MediaPlayer CHOMP_PLAYER = new MediaPlayer(CHOMP_SOUND);
	public static final MediaPlayer EAT_GHOST_PLAYER = new MediaPlayer(EAT_GHOST_SOUND);
	public static final MediaPlayer EAT_FRUIT_PLAYER = new MediaPlayer(EAT_FRUIT_SOUND);
	public static final MediaPlayer DEATH_PLAYER = new MediaPlayer(DEATH_SOUND);
	public static final MediaPlayer BEGINNING_PLAYER = new MediaPlayer(BEGINNING_SOUND);
	// boards
	private static final String ORIGINAL_BOARD =
			  "############################\n"
			+ "#............##............#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#o####.#####.##.#####.####o#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#..........................#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#......##....##....##......#\n"
			+ "######.##### ## #####.######\n"
			+ "     #.##### ## #####.#     \n"
			+ "     #.##          ##.#     \n"
			+ "     #.## ###--### ##.#     \n"
			+ "######.## #      # ##.######\n"
			+ "      .   #      #   .      \n"
			+ "######.## #      # ##.######\n"
			+ "     #.## ######## ##.#     \n"
			+ "     #.##          ##.#     \n"
			+ "     #.## ######## ##.#     \n"
			+ "######.## ######## ##.######\n"
			+ "#............##............#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#o..##.......  .......##..o#\n"
			+ "###.##.##.########.##.##.###\n"
			+ "###.##.##.########.##.##.###\n"
			+ "#......##....##....##......#\n"
			+ "#.##########.##.##########.#\n"
			+ "#.##########.##.##########.#\n"
			+ "#..........................#\n"
			+ "############################";
	private static final String TEST_BOARD =
			  "      ################      \n"
			+ "      #..............#      \n"
			+ "      #.##.######.##.#      \n"
			+ "      #.##.######.##.#      \n"
			+ "      #.##...##...##.#      \n"
			+ "      #.####.##.####.#      \n"
			+ "#######.####.##.####.#######\n"
			+ "........##........##........\n"
			+ "###.######.######.######.###\n"
			+ "###.######.######.######.###\n"
			+ "#.......##...##...##.......#\n"
			+ "#.#####.####.##.####.#####.#\n"
			+ "#.#####.####.##.####.#####.#\n"
			+ "#....##..............##....#\n"
			+ "####.####.###--###.####.####\n"
			+ "####.####.#      #.####.####\n"
			+ "..##......#      #......##..\n"
			+ "#.##.####.#      #.####.##.#\n"
			+ "#....####.########.####....#\n"
			+ "#.##.##..............##.##.#\n"
			+ "#.##.##.############.##.##.#\n"
			+ "#.##.##.############.##.##.#\n"
			+ "..##.##......##......##.##..\n"
			+ "####.#######.##.#######.####\n"
			+ "####.#######.##.#######.####\n"
			+ "#..........................#\n"
			+ "#.##.##################.##.#\n"
			+ "#.##.#                #.##.#\n"
			+ "#.##.#                #.##.#\n"
			+ "#.##.#                #.##.#\n"
			+ "#....#                #....#\n"
			+ "######                ######";
	private static final String MS_PM_1_BOARD =
			  "############################\n"
			+ "#......##..........##......#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#..........................#\n"
			+ "###.##.#####.##.#####.##.###\n"
			+ "  #.##.#####.##.#####.##.#  \n"
			+ "###.##.#####.##.#####.##.###\n"
			+ "....##.......##.......##....\n"
			+ "###.#####.########.#####.###\n"
			+ "  #.#####.########.#####.#  \n"
			+ "  #......................#  \n"
			+ "  #.#####.###--###.#####.#  \n"
			+ "  #.#####.#      #.#####.#  \n"
			+ "  #.##....#      #....##.#  \n"
			+ "  #.##.##.#      #.##.##.#  \n"
			+ "###.##.##.########.##.##.###\n"
			+ ".......##..........##.......\n"
			+ "###.########.##.########.###\n"
			+ "  #.########.##.########.#  \n"
			+ "  #..........##..........#  \n"
			+ "  #.#####.########.#####.#  \n"
			+ "###.#####.########.#####.###\n"
			+ "#..........................#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#.####.##....##....##.####.#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#..........................#\n"
			+ "############################";
	private static final String MS_PM_2_BOARD =
			  "############################\n"
			+ ".......##..........##.......\n"
			+ "######.##.########.##.######\n"
			+ "######.##.########.##.######\n"
			+ "#............##............#\n"
			+ "#.#######.##.##.##.#######.#\n"
			+ "#.#######.##.##.##.#######.#\n"
			+ "#.##......##.##.##......##.#\n"
			+ "#.##.####.##....##.####.##.#\n"
			+ "#.##.####.########.####.##.#\n"
			+ "#......##.########.##......#\n"
			+ "######.##..........##.######\n"
			+ "######.##.###--###.##.######\n"
			+ "#......##.#      #.##......#\n"
			+ "#.####.##.#      #.##.####.#\n"
			+ "#.####....#      #.##.####.#\n"
			+ "#...##.##.########.##.##...#\n"
			+ "###.##.##..........##.##.###\n"
			+ "  #.##.####.####.####.##.#  \n"
			+ "  #.##.####.####.####.##.#  \n"
			+ "  #.........####.........#  \n"
			+ "  #.#######.####.#######.#  \n"
			+ "###.#######.####.#######.###\n"
			+ ".......##..........##.......\n"
			+ "###.##.##.########.##.##.###\n"
			+ "###.##.##.########.##.##.###\n"
			+ "#...##.......##.......##...#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#..........................#\n"
			+ "############################";
	private static final String MS_PM_3_BOARD =
			  "############################\n"
			+ "#.........##....##.........#\n"
			+ "#.#######.##.##.##.#######.#\n"
			+ "#.#######.##.##.##.#######.#\n"
			+ "#.##.........##.........##.#\n"
			+ "#.##.##.####.##.####.##.##.#\n"
			+ "#....##.####.##.####.##....#\n"
			+ "####.##.####.##.####.##.####\n"
			+ "####.##..............##.####\n"
			+ ".....####.########.####.....\n"
			+ "#.##.####.########.####.##.#\n"
			+ "#.##....................##.#\n"
			+ "#.####.##.###--###.##.####.#\n"
			+ "#.####.##.#      #.##.####.#\n"
			+ "#......##.#      #.##......#\n"
			+ "#.##.####.#      #.####.##.#\n"
			+ "#.##.####.########.####.##.#\n"
			+ "#.##....................##.#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#......##....##....##......#\n"
			+ "###.##.##.########.##.##.###\n"
			+ "###.##.##.########.##.##.###\n"
			+ "#...##................##...#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#......##....##....##......#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#......##..........##......#\n"
			+ "############################";
	private static final String MS_PM_4_BOARD =
			  "############################\n"
			+ "#..........................#\n"
			+ "#.##.####.########.####.##.#\n"
			+ "#.##.####.########.####.##.#\n"
			+ "#.##.####.##....##.####.##.#\n"
			+ "#.##......##.##.##......##.#\n"
			+ "#.####.##.##.##.##.##.####.#\n"
			+ "#.####.##.##.##.##.##.####.#\n"
			+ "#......##....##....##......#\n"
			+ "###.########.##.########.###\n"
			+ "  #.########.##.########.#  \n"
			+ "  #....##..........##....#  \n"
			+ "###.##.##.###--###.##.##.###\n"
			+ "....##.##.#      #.##.##....\n"
			+ "######....#      #....######\n"
			+ "######.##.#      #.##.######\n"
			+ "....##.##.########.##.##....\n"
			+ "###.##.##..........##.##.###\n"
			+ "  #....#####.##.#####....#  \n"
			+ "  #.##.#####.##.#####.##.#  \n"
			+ "  #.##.......##.......##.#  \n"
			+ "  #.#####.##.##.##.#####.#  \n"
			+ "###.#####.##.##.##.#####.###\n"
			+ "#.........##....##.........#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#.##...##..........##...##.#\n"
			+ "#.##.#######.##.#######.##.#\n"
			+ "#.##.#######.##.#######.##.#\n"
			+ "#............##............#\n"
			+ "############################";
	public static final String[] BOARDS = new String[] {ORIGINAL_BOARD, TEST_BOARD, MS_PM_1_BOARD, MS_PM_2_BOARD, MS_PM_3_BOARD, MS_PM_4_BOARD};
	public static final int ORIGINAL = 0;
	public static final int TEST = 1;
	public static final int MS_PACMAN_1 = 2;
	public static final int MS_PACMAN_2 = 3;
	public static final int MS_PACMAN_3 = 4;
	public static final int MS_PACMAN_4 = 5;

}
