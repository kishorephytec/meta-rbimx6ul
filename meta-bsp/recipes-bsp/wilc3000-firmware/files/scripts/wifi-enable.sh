#!/bin/sh

# connect with router
wpa_supplicant -B -D nl80211 -i wlan0 -c /etc/wpa_supplicant.conf

udhcpc -i wlan0
