# Copyright (c) 2009 Graham Edgecombe <grahamedgecombe@gmail.com>
# 
# Permission is hereby granted, free of charge, to any person
# obtaining a copy of this software and associated documentation
# files (the "Software"), to deal in the Software without
# restriction, including without limitation the rights to use,
# copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the
# Software is furnished to do so, subject to the following
# conditions:
# 
# The above copyright notice and this permission notice shall be
# included in all copies or substantial portions of the Software.
# 
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
# EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
# OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
# NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
# HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
# WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
# FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
# OTHER DEALINGS IN THE SOFTWARE.

from com.rs2hd.event import Event
from com.rs2hd.model import World

# event that runs after 1500ms then stops itself
# adds hitpoints and cancels the busy flag
class EatEvent(Event):
	# start the event for the specified player and heal by the specified amount
	# start the standard eating animation
	# sets the buys flag so other actions cannot happen
	def __init__(self, player, amount):
		Event.__init__(self, 1500)
		self.player = player
		self.amount = amount
		player.setBusy(True)
		player.animate(829)
	# heal the player
	# reset the busy flag so other actions can happen
	def execute(self):
		self.player.heal(self.amount)
		self.player.setBusy(False)
		Event.stop(self)

# makes the player eat the specified item (and get healed by the specified
#  amount)
def eat(player, id, slot, amount):
	# check if the player is busy, if so do not complete the action
	if player.isBusy():
		return
	# if the inventory contains the food
	item = player.getInventory().getContainer().get(slot)
	if item.getId() == id and item.getAmount() == 1:
		# delete the food
		player.getInventory().getContainer().set(slot, None)
		player.getInventory().refresh()
		# send a message saying it is eating
		player.getActionSender().sendMessage("You eat the " + item.getDefinition().getName() + ".")
		# register the eating event
		World.getInstance().registerEvent(EatEvent(player, amount))

# manta ray:
def item_select_391(player, slot):
	eat(player, 391, slot, 22)

# shark:
def item_select_385(player, slot):
	eat(player, 385, slot, 20)

# anchovies:
def item_select_319(player, slot):
	eat(player, 319, slot, 1)

# shrimp:
def item_select_315(player, slot):
	eat(player, 315, slot, 3)

# cooked chicken:
def item_select_2140(player, slot):
	eat(player, 2140, slot, 3)

# cooked meat:
def item_select_2142(player, slot):
	eat(player, 2142, slot, 3)

# bread:
def item_select_2309(player, slot):
	eat(player, 2309, slot, 5)

# herring:
def item_select_347(player, slot):
	eat(player, 347, slot, 5)

# mackerel:
def item_select_355(player, slot):
	eat(player, 345, slot, 6)

# trout:
def item_select_333(player, slot):
	eat(player, 333, slot, 7)

# salmon:
def item_select_329(player, slot):
	eat(player, 329, slot, 9)

# tuna:
def item_select_361(player, slot):
	eat(player, 361, slot, 10)

# lobster:
def item_select_379(player, slot):
	eat(player, 379, slot, 12)

# bass:
def item_select_365(player, slot):
	eat(player, 365, slot, 12)

# swordfish:
def item_select_373(player, slot):
	eat(player, 373, slot, 14)

# monkfish:
def item_select_7946(player, slot):
	eat(player, 7946, slot, 16)

# sea turtle:
def item_select_397(player, slot):
	eat(player, 397, slot, 21)

