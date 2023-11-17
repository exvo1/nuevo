aCis Interlude Low-Mid-PvP Server Files.

Files are used to live servers and running without problems.

Most of the Features are configurable so you can change them to your needs.
 

Hot Informations

Balance System Option: Which has been tested many times in live servers and its very good.

Elfocrash bot engine working!

FIles are keeping updating while me or a customer find something wrong on it.

Basic Information (Configurable)

Experience Rates: x2000
SP Rates: x2000
Adena: x 2000

 

Enchant Rates (Configurable)

Safe +3
Max +20
Normal Enchant Scrolls 65%
Blessed Max Enchant +14 -> 100%
Crystal max +16 -> 50% (on break enchant still the same)
Custom Scroll max +20 -> (+17 -> 95% , +18 -> 90% , +19 -> 85% , +20 -> 80% )

Easy Configurable with xml file

 

Augmentation Rates (Configurable)

Augment Skills 1 Active + 1 Passive
High grade life stone - 10%
Top grade life stone - 15%

 

Custom Features (Optional - Can be removed)

Custom Weapons: Gold weapons
Custom Armors: Apella, Dynasty, Rykros
Custom Mask
Custom Tattoo ( Level 1 , Premium )

Custom boss scrolls: Increasing special status for 1hour
Cancellation System , after 10 sec you get buffs back
Healers have a small chance to get PvP's from their party


Vip System
Custom Name / Title colors (via .vip)
x2 Mass Vote Reward
x2 Pvp Reward
+5% chance to enchant items
Configurable drops from Farm - Party mobs, Raid-Grand bosses
Less chance to drop Item's from Pk's (Optional)
.vip command ( change name/title colors )

Vip Chat System(public chat,you can talk with ^ )


Pk System  (Optional-Can be removed)
You can drop items by PK's.You are safe until 10 PK's
After 10 you have big chance to drop Items
If You are VIP you are safe until 20 PK's
1 item can be dropped each time
There are 70% chance to drop
If you are VIP there are 30% chance to drop


Bosses (Configurable)
Special Boss every 4 Hour's.
Epic Bosses every 3 Hour's.
Normal Bosses every 1 Hour.

Events
TVT
DM
CTF
Party Farm every 6 hour's with 1 event hour duration (Configurable)
Tournaments (Configurable team size, currently 1v1, 3v3, 5v5, 9v9)

Specific rewards for each team size winners

 

Pvp System

Every hour most Pvp killer from Pvp Zone will be rewarded with extra Pvp medal (Configurable)

Every 24 Hour's Top Pvp/Pk Killer will be rewarded with Event medal (Configurable)


Party Farm (Configurable)
Opens every 6 hour's
Duration 1 hour
Custom Mini Bosses with special drops
Minimum players for enter is 3
Every member must have at least 10 Pvp's to join (Optional)
1 player per PC are allowed

Players are teleporting in a random pt member in Party Zone / 

If none of pt members are in the zone then it teleports all the party there.

 

Olympiad (Configurable)

Olympiad period every 1 week (Configurable)
Heroes will be given 2 hour after period ends
No custom items allowed (Allowed: tattoo level 1) (Configurable)
Max enchant is +6 (Configurable)

Over enchanted items will be automatically counted as +6

Ranking update after every match
The Olympiad begins every day at 18:00 and ends at 00:00 AM (GMT+2)﻿ (Configurable)

 

More Features:

 

There are 2 available commands to change server balance ( Real time changes )

//balance -> You can change status , such as p.Atk, atk.Spd etc.
//balancer -> You can change damages from class to class OR (Class to All enemy classes(9/7 update))
           (Either on PvP neither on Olympiad)

 

More Balance Settings

Every class have a passive skill to control balance
Option to Archer critical damage ( % )
Option to control max continuously critical hits for Archer Classes
 

Vote Manager + Mass Vote System + Vote Buff

Vote Manager with rewards from Topzone, Hopzone, Network, Brasil, L2Votes
Mass Vote from Topzone, Hopzone, Network, Topco
Vote buff available after player votes at least at 1 vote site (can be changed to your needs) and then a button with buff will be available on Vote Manager for 11 hours.
 

Anti AFK System

If player is AFK ( > 10 min without any action ) , he will not gain any mass GM reward ( you can use it for whatever you want )
Event -> If player is afk in event he will get dismissed and not rewarded
 

Skin System

Currently there are 14 available skins, you can add yours too
You can try before you buy them by .skintry
*NEW* double click to equip/unequip the skins
 

Weapon Skin System

You can set your Weapon skins(Of course you will able to use only the same type of weapons, ex. If you wear bow you can only equip bow skin)
Example: <skin id="15050" weaponId="11112" type="BOW"/> <!-- Bow of Halisha -->
                          The skin id is 15050, which copy style of 11112 weapon id with Bow type.

 

Dynamic pvp zone

Configurable by the xml file of zone
time option ( time needed to change , in minutes )
locs option ( location after player death , will be selected randomized )
rewards option ( reward top PVP Killer after each zone change)
disabled Classes option
disabled Items option
.exit to leave from zone
 

Available commands

.menu
.vip
.skintry
.online
.deposit/withdraw
.exit ( Only from PVP zone )
.castlemanager
.drop or shift + click to Raid for drops
.repair
.tvtjoin / .tvtleave / .tvtinfo
.ctfjoin / .ctfleave / .ctfinfo
.dmjoin / .dmleave / .dminfo
 

And much more Features...

 

Passive Balance skill options:

Olympiad. Every status inside <customand olympiad="true"> will effect only to Olympiad.
PvP. Every status inside <customand olympiad="false"> will effect everywhere (but not to Olympiad).
General. Every status without <customand> status (where <!-- General --> appears) will effect both Olympiad and PvP.

Skill Example:
  
    <skill id="10050" levels="1" name="duelist">
        <set name="target" val="TARGET_SELF"/>
        <set name="skillType" val="BUFF"/>
        <set name="operateType" val="OP_PASSIVE"/>
        <for>
        <!-- General -->

        <!-- PVP etc. -->
            <customand olympiad="false">
               
            </customand>    

        <!-- Oly -->
            <customand olympiad="true">
                
            </customand>    
        </for>
    </skill>

Fake Autobots

Elfocrash autobot engine working

Common Problems of this engine(shared from Elfo) are fixed 
 

FIles are keeping updating while me or a customer find something wrong on it.

A good balance system can be added as Extra (including classes skill fixes + each class balance system + Oly class balance system).

Balance system has been tested many times in live servers and its very good.
